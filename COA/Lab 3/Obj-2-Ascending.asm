; NAME - ARPIT KUMAR MOHANTY
; REGISTRATION NUMBER: 2341013237
; LAB 3
; OBJ 2(a) [ARRANGE THE ELEMENTS OF AN GIVEN ARRAY OF SIZE N IN ASCENDING ORDER]

.DATA
count DB 06
value DB 0FH,09H,14H,45H,3FH,24H
.CODE
MAIN PROC
    MOV AX, DATA
    MOV DS, AX
    LEA DI, count
    MOV CH, [DI]
    DEC CH
UP2: MOV CL,CH
     LEA SI, value
UP1: MOV AL, [SI]
     CMP AL, [SI+1]
     JC DOWN
     MOV DL, [SI+1]
     XCHG [SI], DL
     MOV [SI+1], DL
DOWN: INC SI
      DEC CL
      JNZ UP1
      DEC CH
      JNZ UP2
      
      END MAIN