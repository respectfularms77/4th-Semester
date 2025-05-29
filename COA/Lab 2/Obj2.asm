; Name: Arpit Kumar Mohanty
; Registration Number: 2341013237
; Section: 23412G1
; Lab 2 Objective - 2 //Find the Sum & Average of a 16 Bit Number

MOV AX, 0000H
MOV DS, AX
MOV SI, 4000H
MOV CL,[SI]
MOV CH, 00H
MOV BX, CX
MOV DX, 0000H
MOV AX, 0000H
L2: INC SI
INC SI
ADD AX, [SI]
JNC L1
INC DX
L1: DEC CL
JNZ L2
INC SI
INC SI
MOV [SI], AX
INC SI
INC SI
MOV [SI], DX
DIV BX
INC SI
INC SI
MOV [SI], AX
INC SI
INC SI
MOV [SI], DX
HLT