;Name: Arpit Kumar Mohanty
;Registration Number: 2341013237
;Lab: 6		
;Objective: 1 	 //Find the factorial of a given 8-bit number

AREA FACTORIAL, CODE, READONLY
	ENTRY
START
	MOV R0, #5 ;n
	MOV R1, #1 ;result
fact_loop
	CMP R0, #0
	BEQ end_loop ; If R0 = 0, branch to end_loop
	MUL R2, R1, R0
	MOV R1, R2 ; R1 = R1 * R0
	SUBS R0, R0, #1 ; R0 = R0 - 1
	B fact_loop ; Repeat the loop
end_loop
	LDR R2, =RESULT ; Store the result in memory
	STR R1, [R2]
EXT B EXT
	AREA RES, DATA, READWRITE
RESULT DCD 0X0
END

; 	C-CODE FOR FACTORIAL
;if (n == 0) {
; return 1;
; }
; return n * factorial(n - 1);
; }