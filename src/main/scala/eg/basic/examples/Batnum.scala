package eg.basic.examples

import language.reflectiveCalls
import language.postfixOps
import eg.basic.BASIC

// Taken from BASIC Computer Games, (c) 1978 by David H. Ahl
// http://www.atariarchives.org/basicgames/showpage.php?page=14
object Batnum extends BASIC with App {

  10 PRINT TAB(33) + "BATNUM"
  20 PRINT TAB(15) + "CREATIVE COMPUTING   MORRISTOWN, NEW JERSEY"
  30 PRINT ""
  40 PRINT ""
  110 PRINT "THIS PROGRAM IS A 'BATTLE OF NUMBERS'"
  120 PRINT "GAME, WHERE THE COMPUTER IS YOUR OPPONENT"
  130 PRINT ""
  140 PRINT "THE GAME STARTS WITH AN ASSUMED PILE OF OBJECTS."
  150 PRINT "YOU AND YOUR OPPONENT ALTERNATELY REMOVE OBJECTS FROM"
  160 PRINT "THE PILE. WINNING IS DEFINED IN ADVANCE AS TAKING THE"
  170 PRINT "LAST OBJECT OR NOT. YOU CAN ALSO SPECIFY SOME OTHER"
  180 PRINT "BEGINNING CONDITIONS. DON'T USE ZERO, HOWEVER, IN"
  190 PRINT "PLAYING THE GAME."
  200 PRINT ""
  210 GOTO 330
  220 FOR I IN 1 TO 10
  230 PRINT ""
  240 NEXT I
  330 INPUT "ENTER PILE SIZE" AS N
  350 IF N <> 0 THEN 370
  360 GOTO 330
  370 IF N <> INT(N) THEN 220
  380 IF N < 1 THEN 220
  390 INPUT "ENTER WIN OPTION - 1 TO TAKE LAST, 2 TO AVOID LAST:" AS M
  410 IF M =? 1 THEN 430
  420 IF M <> 2 THEN 390
  430 INPUT "ENTER MIN" AS A
  435 INPUT "ENTER MAX" AS B
  450 IF A > B THEN 430
  460 IF A < 1 THEN 430
  470 IF A <> INT(A) THEN 430
  480 IF B <> INT(B) THEN 430
  490 INPUT "ENTER START OPTION - 1 COMPUTER FIRST, 2 YOU FIRST" AS S
  510 IF S =? 1 THEN 530
  520 IF S <> 2 THEN 490
  530 LET C := A + B
  540 IF S =? 2 THEN 570
  550 GOSUB 600
  560 IF W =? 1 THEN 220
  570 GOSUB 810
  580 IF W =? 1 THEN 220
  590 GOTO 550
  600 LET Q := N
  610 IF M =? 1 THEN 630
  620 LET Q := Q - 1
  630 IF M =? 1 THEN 680
  640 IF N > A THEN 720
  650 LET W := 1
  660 PRINT "COMPUTER TAKES "
  661 PRINT N
  662 PRINT " AND LOSES"
  670 RETURN
  
  
  RUN

}