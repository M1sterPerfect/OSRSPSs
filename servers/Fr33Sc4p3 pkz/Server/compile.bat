::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
::                                                        ::
:: All of the following code is (C) Copywrited 2006-2007, ::
::                  fr33sc4p3 thug life                   ::
::                                                        ::
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

@echo off
set pro=%programfiles%\Java\jdk1.5.0
set pro2=%programfiles%\Java\jdk1.6.0
set jac=\bin\javac.exe
set jav=\bin\java.exe
if exist "C:\Program Files (x86)\" set programfiles="C:\Program Files (x86)
cls
:menu
title The Perfect Compiler version 1.6
echo Welcome to fr33sc4p3's compiler.
echo Go to www.fr33sc4p3.smfforfree2.com or moparscape furoms for help.
echo Thanks for using this Idoit friendly compiler :D.
echo.
echo Press- c - Compile your server.
echo Press- r - To Run your server.
echo Press- e - To exit out of the program.
echo.
echo.
set /p c=Option: 
if %c%==c goto c
if %c%==C goto c
if %c%==r goto r
if %c%==R goto r
if %c%==e goto e
if %c%==E goto e
if %c%==* goto er
goto er
:c
cls
title Compiler
goto cjc
:c2
if exist src (goto cl) else (goto c3)
:c3
if exist *.java (goto cl2) else (goto ce)
:c4
%javac% -cp . *.java
pause
cls
goto menu
:c5
%javac% -cp . .\src\*.java
pause
move .\src\*.class .\classes\
cls
goto menu
:ce
cls
echo You need to have Java files for this Compiler to Compile.
pause
cls
goto menu
:r
cls
title Runserver
goto cj
:r2
set rjava=%java% -Xmx1024m -cp .;./jython.jar;./MySql/mysql-connector-java-3.0.17-ga-bin.jar server
cls
goto r3
:r3
if exist .\classes\server.class (goto sl2) else (goto r4)
:r4
if exist .\server.class (goto sl) else (goto se)
:r5
%rjava%
pause
cls
goto menu
:r6
set rjava=
set rjava=%java% -cp .;./classes; Server
%rjava%
pause
cls
goto menu
:se
cls
title Error
echo You do not have a Server.class. Make sure that you have used the
echo compiler with your server BEFORE you try runing it.
pause
cls
goto menu
:er
cls
title Error
echo Invalid command. Please make sure the commands you type
echo in are correct.
pause
cls
goto menu
:e
cls
exit
:cjc
if exist "%pro%_06%jac%" (goto sjc) else (goto cjc2)
:cjc2
if exist "%pro%_07%jac%" (goto sjc2) else (goto cjc3)
:cjc3
if exist "%pro%_08%jac%" (goto sjc3) else (goto cjc4)
:cjc4
if exist "%pro%_09%jac%" (goto sjc4) else (goto cjc5)
:cjc5
if exist "%pro%_10%jac%" (goto sjc5) else (goto cjc6)
:cjc6
if exist "%pro2%%jac%" (goto sjc6) else (goto cjc7)
:cjc7
if exist "%pro%%jac%" (goto sjc7) else (goto cjc8)
:cjc8
if exist "%pro%_01%jac%" (goto sjc8) else (goto cjc9)
:cjc9
if exist "%pro%_02%jac%" (goto sjc9) else (goto cjc10)
:cjc10
if exist "%pro%_03%jac%" (goto sjc10) else (goto cjc11)
:cjc11
if exist "%pro%_04%jac%" (goto sjc11) else (goto cjc12)
:cjc12
if exist "%pro%_05%jac%" (goto sjc12) else (goto je)
:sjc
set javac="%pro%_06%jac%"
goto c2
:sjc2
set javac="%pro%_07%jac%"
goto c2
:sjc3
set javac="%pro%_08%jac%"
goto c2
:sjc4
set javac="%pro%_09%jac%"
goto c2
:sjc5
set javac="%pro%_10%jac%"
goto c2
:sjc6
set javac="%pro2%%jac%"
goto c2
:sjc7
set javac="%pro%%jac%"
goto c2
:sjc8
set javac="%pro%_01%jac%"
goto c2
:sjc9
set javac="%pro%_02%jac%"
goto c2
:sjc10
set javac="%pro%_03%jac%"
goto c2
:sjc11
set javac="%pro%_04%jac%"
goto c2
:sjc12
set javac="%pro%_05%jac%"
goto c2
:cj
if exist "%pro%_06%jav%" (goto sj) else (goto cj2)
:cj2
if exist "%pro%_07%jav%" (goto sj2) else (goto cj3)
:cj3
if exist "%pro%_08%jav%" (goto sj3) else (goto cj4)
:cj4
if exist "%pro%_09%jav%" (goto sj4) else (goto cj5)
:cj5
if exist "%pro%_10%jav%" (goto sj5) else (goto cj6)
:cj6
if exist "%pro2%%jav%" (goto sj6) else (goto cj7)
:cj7
if exist "%pro%%jav%" (goto sj7) else (goto cj8)
:cj8
if exist "%pro%_01%jav%" (goto sj8) else (goto cj9)
:cj9
if exist "%pro%_02%jav%" (goto sj9) else (goto cj10)
:cj10
if exist "%pro%_03%jav%" (goto sj10) else (goto cj11)
:cj11
if exist "%pro%_04%jav%" (goto sj11) else (goto cj12)
:cj12
if exist "%pro%_05%jav%" (goto sj12) else (goto je)
:sj
set java="%pro%_06%jav%"
goto r2
:sj2
set java="%pro%_07%jav%"
goto r2
:sj3
set java="%pro%_08%jav%"
goto r2
:sj4
set java="%pro%_09%jav%"
goto r2
:sj5
set java="%pro%_10%jav%"
goto r2
:sj6
set java="%pro2%%jav%"
goto r2
:sj7
set java="%pro%%jav%"
goto r2
:sj8
set java="%pro%_01%jav%"
goto r2
:sj9
set java="%pro%_02%jav%"
goto r2
:sj10
set java="%pro%_03%jav%"
goto r2
:sj11
set java="%pro%_04%jav%"
goto r2
:sj12
set java="%pro%_05%jav%"
goto r2
:je
cls
title Error
echo You do not have JDK 5.0 or JDK 6.0. Go to Mod Taharok's tutorial
echo on the Moparscape Tuturoials section for step-by-step instructions
echo link to download the newest JDK Update.
pause
cls
goto menu
:sl
cls
echo Ran Server at %time% on %date%. >> "Compile Logs.txt"
echo Server was run using %java%. >> "Compile Logs.txt"
echo Thank-you for using Thug life's (fr33sc4p3) 'Perfect' Compiler! :) >> "Compile Logs.txt"
echo. >> "Compile Logs.txt"
goto r5
:sl2
cls
echo Ran Server at %time% on %date%. >> "Compile Logs.txt"
echo Server was run using %java%. >> "Compile Logs.txt"
echo Thank-you for using Thug life's (fr33sc4p3) 'Perfect' Compiler! :) >> "Compile Logs.txt"
echo. >> "Compile Logs.txt"
goto r6
:cl
cls
echo Compiled Java files at %time% on %date%. >> "Compile Logs.txt"
echo Java files were compiled using %javac%. >> "Compile Logs.txt"
echo Thank-you for using Thug life's (fr33sc4p3) 'Perfect' Compiler! :) >> "Compile Logs.txt"
echo. >> "Compile Logs.txt"
goto c5
:cl2
cls
echo Compiled Java files at %time% on %date%. >> "Compile Logs.txt"
echo Java files were compiled using %javac%. >> "Compile Logs.txt"
echo Thank-you for using Thug life's (fr33sc4p3) 'Perfect' Compiler! :) >> "Compile Logs.txt"
echo. >> "Compile Logs.txt"
goto c4
