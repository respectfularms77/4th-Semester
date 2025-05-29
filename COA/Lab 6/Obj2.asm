;Name: Arpit Kumar Mohanty
;Registration Number: 2341013237
;Lab: 6		
;Objective: 2 	 //Find the Fibonacci Series up to n digits (8-bit number).

AREA fibnacci, CODE, READONLY
	ENTRY
START
	MOV R1, #01
	MOV R2, #00
	MOV R3, #00
	LDR R0, =COUNT
	LDR R6, =FIB_SERIES
	LDRB R5, [R0]
	CMP R5, #1
	BLE STOP1
	STRB R2, [R6], #01
	SUBS R5, R5, #01
	STRB R1,[R6],#01
BACK
	SUBS R5,R5,#01
	BEQ STOP
	ADD R3,R1,R2
	STRB R3,[R6],#01
	MOV R2,R1
	MOV R1,R3
	B BACK
STOP1 STRB R3,[R6]
STOP B STOP
COUNT DCB 0X0A ; N =10
	AREA DATA1, DATA, READWRITE
FIB_SERIES DCB 0X0,0X0,0X0,0X0,0X0,0X0,0X0,0X0,0X0,0X0
END