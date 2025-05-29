;Name - Arpit Kumar Mohanty
;Registration Number - 2341013237  
; Section: 23412G1
; Lab 2 Objective - 3   //Count no. of 0’s in an 8-bit number.

MOV AX,0000H
MOV DS,AX
MOV SI, 2000H
MOV AL, [BX]
MOV CL, 08H
MOV BL, 00H
L2: SHR AL,01H
JC L1
INC BL
L1: DEC CL
JNZ L2 
INC SI
MOV [SI], BL
HLT