/**
 * - bruncle == the sex. He finished the script, it now ends when
 *   you're in Lumbridge. Everyone thank him.
 * - The waits aren't really standardized. Just random shit that
 *   I happened to write out when it came to mind. They need
 *   to be cleaned up; sometimes it's too fast, sometimes too slow.
 * - The ranging of the rat is a stupid hack because I was too
 *   lazy to write it well. It's not difficult, but it's
 *   more than 3 lines, which means it's not worth my time.
 * - As always, search for XXX for my important notes.
 *
 * @author pd
 */
public class TutorialIsland extends Script {

	public static String[] commands = {"tutIsland"};

	private static final int OBJECT_FIRST_DOOR = 3014;
	private static final int OBJECT_TREE = 3033;
	private static final int OBJECT_FIRE = 2732;
	private static final int OBJECT_GATE = 3016;
	private static final int OBJECT_KITCHEN_DOOR = 3017;
	private static final int OBJECT_RANGE = 3039;
	private static final int OBJECT_KITCHEN_DOOR2 = 3018;
	private static final int OBJECT_QUEST_DOOR = 3019;
	private static final int OBJECT_QUEST_LADDER = 3029;
	private static final int OBJECT_TIN = 3043;
	private static final int OBJECT_COPPER = 3042;
	private static final int OBJECT_FURNACE = 3044;
	private static final int OBJECT_ANVIL = 2783;
	private static final int INTERFACE_SMITHING = 994;
	private static final int INTERFACE_DAGGER = 1119;
	private static final int ITEM_DAGGER = 1205;
	private static final int OBJECT_DUNGEON_GATE = 3021;
	private static final int OBJECT_CAGE_GATE = 3022;
	private static final int OBJECT_DUNGEON_LADDER = 3030;
	private static final int OBJECT_BANK_BOOTH = 3045;
	private static final int INTERFACE_YES = 2461;
	private static final int OBJECT_BANK_DOOR1 = 3024;
	private static final int OBJECT_BANK_DOOR2 = 3025;
	private static final int OBJECT_TEMPLE_DOOR_CLOSED = 1519;
	private static final int OBJECT_TEMPLE_DOOR2 = 3026;
	private static final int INTERFACE_WIND_STRIKE = 1152;
	private static final int INTERFACE_MAGE_YES = 2461;

	private static final int INTERFACE_CHAR_DESIGN = 3559;
	private static final int INTERFACE_CHAR_ACCEPT = 3651;
	private static final int[] INTERFACES_CHAR_SEX = new int[] { 3698, 3699 };
	private static final int[] INTERFACES_DESIGN = new int[] {
		3666, 3667, 3668, 3669, 3670, 3671, 3672,
		3679, 3685, 3687, 3688, 3689
	};

	private int step = 0;
	private boolean spellSelected = false; // XXX hack for castSpell()

	private int designCurInt = -2;
	private int designClickCount;

	public boolean start(String cmd, String[] args) {
		// XXX length == 1 even with tutIsland().
		// should be fixed in Bot.java.
		if (args.length > 0) {
			try { step = Integer.valueOf(args[0]); }
			catch (Exception e) { }
		}

		log("Starting at step " + step);

		return true;
	}

	public long run(long ticks) {
		if (getDialogText().length() > 0 && getDialogText().contains("Click here to")) {
			continueDialogInterface();
			return random(500, 1000);
		}
		if (checkBackText("Please wait")) {
			return random(500, 1000);
		} else if (checkBackText("Click here to")) {
			continueBackInterface();
			return random(500, 1000);
		}

		if (getInterface() == INTERFACE_CHAR_DESIGN)
			return designCharacter();

		// this is overly long, but the methods end up much
		// cleaner this way.
		switch (step) {
			case 0:
				return talkIntro();
			case 1:
				return walkSurvivalGuide();
			case 2:
				return talkSurvivalGuide();
			case 3:
				return startFire();
			case 4:
				return cookShrimp();
			case 5:
				return walkKitchen();
			case 6:
				return makeDough();
			case 7:
				return bakeBread();
			case 8:
				return walkQuestGuide();
			case 9:
				return talkQuestGuide();
			case 10:
				return walkAndProspect();
			case 11:
				return mineSmeltOre();
			case 12:
				return smithDagger();
			case 13:
				return walkVanakka();
			case 14:
				return talkVanakka();
			case 15:
				return meleeRat();
			case 16:
				return rangeRat();
			case 17:
				return walkBank();
			case 18:
				return doBank();
			case 19:
				return talkFinancialAdvisor();
			case 20:
				return talkMonk();
			case 21:
				return getRunes();
			case 22:
				return castSpell();
			case 23:
				return toLumbridge();
			default:
				log("invalid step. you borked something.");
				shutdown();
		}

		return 0;
	}

	private boolean checkBackText(String text) {
		return (getBackText().length() > 0 && getBackText().contains(text));
	}

	private long talkToNPC(String name) {
		NPC npc = findNPCByName(name);
		if (npc != null) {
			atNPC(npc, "Talk-to");
		}
		return random(2000, 3000);
	}

	private long talkToNPC(String name, boolean incStep) {
		NPC npc = findNPCByName(name);
		if (npc != null) {
			atNPC(npc, "Talk-to");
			if (incStep)
				increaseStep();
		}
		return random(1500, 2000);
	}

	private long designCharacter() {
		if (designClickCount == 0) {
			designCurInt++;
			designClickCount = random(1, 7);
		}

		// choose sex
		if (designCurInt == -1) {
			// our random(int, int) blows goats.
			atInterface(INTERFACES_CHAR_SEX[(random(10, 20) % 2)], 1);
			designCurInt++;
			return random(1000, 2000);
		}

		// accept if we're done
		if (designCurInt == INTERFACES_DESIGN.length) {
			atInterface(INTERFACE_CHAR_ACCEPT, 1);
			return random(1500, 2000);
		}

		atInterface(INTERFACES_DESIGN[designCurInt], 1);
		designClickCount--;
		return random(500, 1000);
	}

	private long talkIntro() {
		if (checkBackText("Interacting with scenery")) {
			increaseStep();
			return random(500, 1000);
		}

		return talkToNPC("RuneScape Guide");
	}

	private long walkSurvivalGuide() {
		int door = findObject(OBJECT_FIRST_DOOR);
		if (door != -1 && getPosition(myPlayer()).x < objectPos(door).x) {
			atObject(door, 1);
			return random(1000, 2000);
		}

		Tile[] path = {new Tile(3103, 3104), new Tile(3103, 3100), new Tile(3103, 3096)};
		if (distanceTo(path[path.length - 1]) > 3) {
			walkPath(path);
			return random(2000, 3000);
		}

		increaseStep();
		return random(500, 1000);
	}

	public long talkSurvivalGuide() {
		if (checkBackText("Viewing the")) {
			if (getTab() != Constants.TAB_INVENTORY) {
				selectTab(Constants.TAB_INVENTORY);
				increaseStep();
			}
			return random(250, 500);
		}

		return talkToNPC("Survival Expert");
	}

	private long startFire() {
		if (checkBackText("gained some")) {
			if (getTab() != Constants.TAB_STATS) {
				selectTab(Constants.TAB_STATS);
				increaseStep();
			}
			return random(250, 500);
		}

		if (getTab() != Constants.TAB_INVENTORY) {
			selectTab(Constants.TAB_INVENTORY);
			return random(500, 1000);
		}

		if (getInvCountPrefix("Tinderbox") == 0)
			return random(250, 500);

		if (getInvCountPrefix("Logs") == 0) {
			int tree = findObject(OBJECT_TREE);
			if (tree != -1) {
				atObject(tree, 1);
				return random(3000, 5000);
			}
			return random(250, 500);
		}

		Tile pos = getPosition(myPlayer());
		while (getObjectAt(pos) != -1) {
			pos.x += (random(10, 20) % 2 == 0 ? -1 : 1) * random(2, 6);
			pos.y += (random(10, 20) % 2 == 0 ? -1 : 1) * random(2, 6);
			if (canReach(pos) && getObjectAt(pos) == -1) {
				walk(pos);
				return 2500 + random(0, 2500);
			}
		}

		if (!isItemSelected()) {
			selectItem(getInventory()[locateInvPrefix("Tinderbox")],
					locateInvPrefix("Tinderbox"));
			return random(500, 1000);
		} else {
			useWithItem(getInventory()[locateInvPrefix("Logs")],
					locateInvPrefix("Logs"));
			return random(2000, 3000);
		}
	}

	private long cookShrimp() {
		if (getInvCountPrefix("Shrimps") > 0) {
			increaseStep();
			return 0;
		}

		if (getInvCountSuffix(" net") == 0)
			return talkToNPC("Survival Expert");

		if (getInvCountSuffix(" shrimps") < 2 && getInvCountPrefix("Burnt ") == 0) {
			if (myPlayer().anim == -1 && !isMoving()) {
				NPC fishingSpot = findNPCByName("Fishing spot");
				if (fishingSpot != null) {
					atNPC(fishingSpot, "Net");
					return random(2000, 3000);
				}
				return 0;
			}
			return 100;
		}

		if (getTab() != Constants.TAB_INVENTORY) {
			selectTab(Constants.TAB_INVENTORY);
			return random(500, 1000);
		}

		int fire = findObject(OBJECT_FIRE);
		if (fire == -1) {
			return startFire();
		} else {
			if (isMoving())
				return 100;

			if (!isItemSelected()) {
				selectItem(getInventory()[locateInvPrefix("Raw shrimps")],
						locateInvPrefix("Raw shrimps"));
				return random(500, 1000);
			} else {
				useWithObject(fire);
				return random(3000, 4000);
			}
		}
	}

	private long walkKitchen() {
		Tile[] path1 = {new Tile(3097, 3092), new Tile(3094, 3092), new Tile(3091, 3092)};
		Tile[] path2 = {new Tile(3083, 3091), new Tile(3080, 3090), new Tile(3080, 3084)};

		int gate = findObject(OBJECT_GATE);
		if (gate == -1)
			return 100;  // it's probably just open, come right back.

		if (getPosition(myPlayer()).x > objectPos(gate).x) {
			if (distanceTo(path1[path1.length - 1]) > 3) {
				walkPath(path1);
				return random(3000, 4000);
			}

			atObject(gate, 1);
			return random(2000, 2500);
		}

		int door = findObject(OBJECT_KITCHEN_DOOR);
		if (door == -1)
			return 100;

		if (distanceTo(path2[path2.length - 1]) > 3) {
			walkPath(path2);
			return random(3000, 4000);
		}

		NPC chef = findNPCByName("Master Chef");
		if (chef != null && canReach(getPosition(chef)))
			increaseStep();
		else {
			atObject(door, 1);
			return random(2500, 5000);
		}
		return random(500, 1000);
	}

	public long makeDough() {
		if (getInvCountSuffix(" dough") > 0) {
			increaseStep();
			return random(500, 1000);
		}

		if (getInvCountSuffix(" flour") == 0)
			return talkToNPC("Master Chef");

		if (getTab() != Constants.TAB_INVENTORY) {
			selectTab(Constants.TAB_INVENTORY);
			return random(500, 1000);
		}

		if (!isItemSelected()) {
			selectItem(getInventory()[locateInvSuffix(" flour")],
					locateInvSuffix(" flour"));
		} else
			useWithItem(getInventory()[locateInvSuffix(" water")],
					locateInvSuffix(" water"));
		return random(500, 1000);
	}

	public long bakeBread() {
		if (getInvCountPrefix("Bread") > 0) {
			if (checkBackText("first loaf")) {
				if (getTab() != Constants.TAB_MUSIC) {
					selectTab(Constants.TAB_MUSIC);
					increaseStep();
				}
				return random(500, 1000);
			}
		}

		if (getTab() != Constants.TAB_INVENTORY) {
			selectTab(Constants.TAB_INVENTORY);
			return random(500, 1000);
		}

		int range = findObject(OBJECT_RANGE);
		if (!isItemSelected()) {
			selectItem(getInventory()[locateInvSuffix(" dough")],
					locateInvSuffix(" dough"));
		} else
			useWithObject(range);
		return random(1500, 2000);
	}

	public long walkQuestGuide() {
		if (checkBackText("only a short distance")) {
			if (getTab() != Constants.TAB_CONTROLS) {
				selectTab(Constants.TAB_CONTROLS);
				return random(500, 1000);
			}
		} else if (checkBackText("Running.")) {
			setRun(true);
			return random(500, 1000);
		} else if (checkBackText("Run to the next guide")) {
			Tile[] path = {
					new Tile(3071, 3097), new Tile(3073, 3105),
					new Tile(3077, 3111), new Tile(3077, 3119),
					new Tile(3078, 3125), new Tile(3086, 3127)
			};

			if (distanceTo(path[path.length - 1]) > 3) {
				walkPath(path);
				return random(1500, 2000);
			}

			int door2 = findObject(OBJECT_QUEST_DOOR);
			if (door2 == -1)
				return 100;

			if (getPosition(myPlayer()).y >= objectPos(door2).y) {
				atObject(door2, 1);
				return random(1000, 2000);
			}

			return 100;
		} else if (checkBackText("Talk with the quest guide")) {
			increaseStep();
			return random(500, 1000);
		}

		// out of order; this is the first thing done.
		int door = findObject(OBJECT_KITCHEN_DOOR2);
		if (door == -1)
			return 100;
		if (getPosition(myPlayer()).x > objectPos(door).x) {
			atObject(door, 1);
			return random(2000, 3000);
		}

		return 0;
	}

	public long talkQuestGuide() {
		// don't advance a step until we're definitely in the mine
		// and it looks like y > 9000 underground, at least here.
		if (getPosition(myPlayer()).y > 9000) {
			increaseStep();
			return random(500, 1000);
		}

		if (checkBackText("Open the Quest journal")) {
			if (getTab() != Constants.TAB_QUESTS) {
				selectTab(Constants.TAB_QUESTS);
				return random(500, 1000);
			}
		} else if (checkBackText("Moving on")) {
			int ladder = findObject(OBJECT_QUEST_LADDER);
			if (ladder != -1) {
				atObject(ladder, 1);
				return random(2000, 3000);
			}
		}

		return talkToNPC("Quest Guide");
	}

	public long walkAndProspect() {
		Tile[] path = {
				new Tile(3081, 9519), new Tile(3078, 9515), new Tile(3080, 9512),
				new Tile(3081, 9508), new Tile(3080, 9504)
		};
		if (distanceTo(path[path.length - 1]) > 3) {
			walkPath(path);
			return random(3000, 4000);
		}

		if (getTab() != Constants.TAB_INVENTORY) {
			selectTab(Constants.TAB_INVENTORY);
			return random(500, 1000);
		}

		if (checkBackText("Prospecting")) {
			int tin = findObject(OBJECT_TIN);
			if (tin != -1)
				atObject(tin, 2);
			return random(4000, 6000);
		} else if (checkBackText("It's tin.")) {
			int copper = findObject(OBJECT_COPPER);
			if (copper != -1)
				atObject(copper, 2);
			return random(4000, 6000);
		} else if (checkBackText("It's copper.")) {
			increaseStep();
			return random(500, 1000);
		}

		return talkToNPC("Mining Instructor");
	}

	public long mineSmeltOre() {
		if (getInvCountPrefix("Bronze bar") > 0) {
			increaseStep();
			return random(500, 1000);
		}

		if (getInvCountSuffix(" pickaxe") == 0)
			return talkToNPC("Mining Instructor");

		if (getInvCountPrefix("Tin ") == 0) {
			int tin = findObject(OBJECT_TIN);
			if (tin != -1)
				atObject(tin, 1);
			return random(6000, 8000);
		}

		if (getInvCountPrefix("Copper ") == 0) {
			int copper = findObject(OBJECT_COPPER);
			if (copper != -1)
				atObject(copper, 1);
			return random(6000, 8000);
		}

		int furnace = findObject(OBJECT_FURNACE);
		if (!isItemSelected())
			selectItem(getInventory()[locateInvPrefix("Tin ")],
					locateInvPrefix("Tin "));
		else
			useWithObject(furnace);
		return random(3000, 4000);
	}

	public long smithDagger() {
		if (getInvCountPrefix("Bronze dagger") > 0) {
			increaseStep();
			return random(500, 1000);
		}

		if (getInvCountPrefix("Hammer") == 0)
			return talkToNPC("Mining Instructor");

		if (getInterface() == INTERFACE_SMITHING) {
			atInterfaceItem(INTERFACE_DAGGER, 1, ITEM_DAGGER, 0);
			return random(3000, 4000);
		}

		int anvil = findObject(OBJECT_ANVIL);
		if (!isItemSelected())
			selectItem(getInventory()[locateInvPrefix("Bronze bar")],
					locateInvPrefix("Bronze bar"));
		else
			useWithObject(anvil);
		return random(3000, 4000);
	}

	public long walkVanakka() {
		// before and after gate again
		Tile[] path1 = {
			new Tile(3079, 9500), new Tile(3080, 9505), new Tile(3086, 9505),
			new Tile(3091, 9503), new Tile(3094, 9503)
		};
		Tile[] path2 = { new Tile(3102, 9505), new Tile(3105, 9507) };

		int gate = findObject(OBJECT_DUNGEON_GATE);
		if (gate == -1)
			return 100;

		if (getPosition(myPlayer()).x <= objectPos(gate).x) {
			if (distanceTo(path1[path1.length - 1]) > 3) {
				walkPath(path1);
				return random(3000, 4000);
			}

			atObject(gate, 1);
			return random(1000, 2000);
		}

		if (distanceTo(path2[path2.length - 1]) > 3) {
			walkPath(path2);
			return random(3000, 4000);
		}

		increaseStep();
		return random(500, 1000);
	}

	// use the whole item name.
	// XXX - why is this atSpecialInventoryItem? blah.
	public long equipItem(String name) {
		atSpecialInventoryItem(getInventory()[locateInvPrefix(name)],
				locateInvPrefix(name), 2);
		return random(1000, 2000);
	}

	public long talkVanakka() {
		if (getInvCountPrefix("Bronze sword") > 0)
			return equipItem("Bronze sword");
		if (getInvCountPrefix("Wooden shield") > 0)
			return equipItem("Wooden shield");

		if (checkBackText("Wielding weapons")) {
			if (getTab() != Constants.TAB_EQUIPMENT) {
				selectTab(Constants.TAB_EQUIPMENT);
				return random(500, 1000);
			}
		} else if (checkBackText("worn inventory")) {
			if (getTab() != Constants.TAB_INVENTORY) {
				selectTab(Constants.TAB_INVENTORY);
				return random(500, 1000);
			} else if (getInvCountPrefix("Bronze dagger") > 0) {
				return equipItem("Bronze dagger");
			}
		} else if (checkBackText("Combat interface.")) {
			if (getTab() != Constants.TAB_ATTACK) {
				selectTab(Constants.TAB_ATTACK);
				return random(500, 1000);
			} else {
				increaseStep();
				return random(500, 1000);
			}
		}

		return talkToNPC("Combat Instructor");
	}

	public long meleeRat() {
		Tile path[] = {new Tile(3107, 9510), new Tile(3111, 9513), new Tile(3112, 9518)};

		int gate = findObject(OBJECT_CAGE_GATE);
		if (gate == -1)
			return 100;

		if (getInvCountPrefix("Shortbow") > 0) {
			increaseStep();
			return random(500, 1000);
		}

		if (checkBackText("Click on the gates indicated")) {
			if (distanceTo(path[path.length - 1]) > 3) {
				walkPath(path);
				return random(3000, 4000);
			}
			atObject(gate, 1);
			return random(2000, 3000);
		} else if (checkBackText("Attacking.")) {
			NPC npc = findNearestNPCByName("Giant rat");
			if (!inCombat(npc) && !inCombat(myPlayer()))
				atNPC(npc, 2);
			return random(3000, 4000);
		} else if (checkBackText("your first kill")) {
			NPC npc = findNPCByName("Combat Instructor");
			if (canReach(getPosition(npc)))
				return talkToNPC("Combat Instructor");

			atObject(gate, 1);
			return random(5000, 6000);
		}

		return 0;
	}

	// XXX XXX XXX XXX XXX
	// this whole god damned method is fucked to all hell.
	// it waits too long if the nearest rat is already in combat,
	// it doesn't handle the rats running away very well,
	// and so on. someone else can clean it up by making a
	// specialized findNearestNPCByName
	public long rangeRat() {
		if (getTab() != Constants.TAB_INVENTORY) {
			selectTab(Constants.TAB_INVENTORY);
			return random(500, 1000);
		}

		if (getInvCountPrefix("Shortbow") > 0)
			return equipItem("Shortbow");

		if (getInvCountSuffix(" arrow") > 0)
			return equipItem("Bronze arrow");

		if (checkBackText("Moving on.")) {
			increaseStep();
			return random(500, 1000);
		}

		Tile spot = new Tile(3110, 9514);
		if (distanceTo(spot) > 2) {
			walk(spot);
			return random(2000, 3000);
		}

		NPC npc = findNearestNPCByName("Giant rat");
		if (!inCombat(npc)) {
			atNPC(npc, 2);
			return random(30000, 40000); // XXX holy christ this is stupid.
		} else
			return random(500, 1000); // wait for another rat
	}

	public long walkBank() {
		// before and after ladder
		Tile[] path1 = {new Tile(3111, 9515), new Tile(3112, 9519), new Tile(3111, 9525)};
		Tile[] path2 = {
				new Tile(3111, 3125), new Tile(3112, 3121),
				new Tile(3116, 3118), new Tile(3122, 3122)
		};

		if (getPosition(myPlayer()).y > 9000) {
			if (distanceTo(path1[path1.length - 1]) > 3) {
				walkPath(path1);
				return random(3000, 4000);
			}

			int ladder = findObject(OBJECT_DUNGEON_LADDER);
			if (ladder != -1) {
				atObject(ladder, 1);
				return random(2000, 3000);
			}
		}

		if (distanceTo(path2[path2.length - 1]) > 3) {
			walkPath(path2);
			return random(3000, 4000);
		}

		increaseStep();
		return random(500, 1000);
	}

	public long doBank() {
		if (getDialogText().length() > 0 && getDialogText().contains("No thanks.")) {
			atInterface(INTERFACE_YES, 1);
			return random(1000, 1500);
		}

		if (getInterface() == Constants.INTERFACE_BANK) {
			closeInterface();
			return random(500, 1000);
		}

		if (checkBackText("your bank box.")) {
			increaseStep();
			return random(500, 1000);
		}

		int booth = findObject(OBJECT_BANK_BOOTH);
		if (booth != -1) {
			atObject(booth, 1);
			return random(1000, 2000);
		}

		return 0;
	}

	public long talkFinancialAdvisor() {
		int door1 = findObject(OBJECT_BANK_DOOR1);
		if (door1 == -1)
			return 100;

		if (getPosition(myPlayer()).x < objectPos(door1).x) {
			atObject(door1, 1);
			return random(1500, 2000);
		}

		if (checkBackText("Continue through the")) {
			int door2 = findObject(OBJECT_BANK_DOOR2);
			if (door2 == -1)
				return 100;
			atObject(door2, 1);
			return random(2500, 3000);
		} else if (checkBackText("all about prayer")) {
			increaseStep();
			return random(500, 1000);
		}

		return talkToNPC("Financial Advisor");
	}

	public long talkMonk() {
		Tile[] path = {
				new Tile(3134, 3120), new Tile(3132, 3114),
				new Tile(3130, 3109), new Tile(3129, 3106)
		};

		// out of order.
		if (checkBackText("Your prayer menu.")) {
			if (getTab() != Constants.TAB_PRAYER) {
				selectTab(Constants.TAB_PRAYER);
				return random(500, 1000);
			}
		} else if (checkBackText("next to the friends list")) {
			if (getTab() != Constants.TAB_IGNORE) {
				selectTab(Constants.TAB_IGNORE);
				return random(500, 1000);
			}
		} else if (checkBackText("your friends list")) {
			if (getTab() != Constants.TAB_FRIENDS) {
				selectTab(Constants.TAB_FRIENDS);
				return random(500, 1000);
			}
		} else if (checkBackText("Your final instructor")) {
			increaseStep();
			return random(500, 1000);
		}

		if (distanceTo(path[path.length - 1]) > 6) {
			walkPath(path);
			return random(3000, 4000);
		}

		int door = findObject(OBJECT_TEMPLE_DOOR_CLOSED);
		if (door != -1) {
			// don't go open it if we're already in the temple
			if (getPosition(myPlayer()).x >= objectPos(door).x) {
				atObject(door, 1);
				return random(1000, 1500);
			}
		}

		return talkToNPC("Brother Brace");
	}

	public long getRunes() {
		Tile path[] = {
				new Tile(3119, 3096), new Tile(3118, 3088), new Tile(3125, 3086),
				new Tile(3132, 3085), new Tile(3138, 3086)
		};

		int door = findObject(OBJECT_TEMPLE_DOOR2);
		if (door == -1)
			return 100;

		if (checkBackText("your final menu.")) {
			if (getTab() != Constants.TAB_MAGIC) {
				selectTab(Constants.TAB_MAGIC);
				return random(500, 1000);
			}
		} else if (checkBackText("Cast Wind Strike")) {
			increaseStep();
			return random(500, 1000);
		}

		if (getPosition(myPlayer()).y > objectPos(door).y) {
			atObject(door, 1);
			return random(2000, 3000);
		}

		if (distanceTo(path[path.length - 1]) > 3) {
			walkPath(path);
			return random(2000, 3000);
		}

		return talkToNPC("Magic Instructor");
	}

	public long castSpell() {
		if (checkBackText("All you need to do now")) {
			increaseStep();
			return random(500, 1000);
		}

		Tile CAST_FROM = new Tile(3139, 3091);
		if (distanceTo(CAST_FROM) > 2) {
			walk(CAST_FROM);
			return random(2000, 3000);
		}

		if (getTab() != Constants.TAB_MAGIC) {
			selectTab(Constants.TAB_MAGIC);
			return random(500, 1000);
		}

		if (!spellSelected) {
			atInterface(INTERFACE_WIND_STRIKE, 2);
			spellSelected = true;
			return random(500, 1000);
		} else {
			NPC npc = findNPCByName("Chicken");
			if (npc != null) {
				castSpellOnNPC(npc);
				spellSelected = false;
				return random(1500, 2000);
			}
		}

		return 0;
	}

	public long toLumbridge() {
		if (findNPCByName("Magic Instructor") == null) {
			log("We're in Lumbridge. You're welcome.");
			finishedTutorial();
			return -1;
		}

		if (getDialogText().indexOf("Do you want to go") != -1) {
			atInterface(INTERFACE_MAGE_YES, 1);
			return random(500, 1000);
		}

		return talkToNPC("Magic Instructor");
	}

	public void increaseStep() {
		step++;
		messageSystem.send("tutorialStep",String.valueOf(step));
	}

	public void finishedTutorial() {
		messageSystem.send("tutorialStatus","finished");
	}
}
