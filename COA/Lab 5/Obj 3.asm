;Name: Arpit Kumar Mohanty
;Registration Number: 2341013237
;Lab: 5     
;Objective: 3	//Separate Even numbers and odds numbers in an array of size N

AREA prog2, CODE, READONLY
	ENTRY 	;Mark first instruction to execute
START
	ldr r0,=count
	ldr r1,[r0]
	ldr r3,=array ; r3 = base address of array=array[0]
	ldr r4,=even  ; r4=base address of even data locations as constant = even[0]
											; = 0x40000000
	ldr r5,=odd ; r5=base address of odd data locations as constant = odd[0]
											; = 0x4000001c
back
	ldr r6, [r3],#4
	ands r7,r6,#1
	beq fwd
	str r6,[r5],#4
	b fwd1
fwd
	str r6,[r4],#4
fwd1
	subs r1,r1,#01
	bne back

exit b exit
; Array declaration
count DCD 0x07
array
		DCD 0x15
		DCD 0x35
		DCD 0x32
		DCD 0x45
		DCD 0x10
		DCD 0x4f
		DCD 0x34
	AREA DATA2,DATA,READWRITE ; TO STORE RESULT IN GIVEN ADDRESS
even
	DCD 0X0
	DCD 0X0
	DCD 0X0
	DCD 0X0
	DCD 0X0
	DCD 0X0
	DCD 0X0
odd
	DCD 0X0
	DCD 0X0
	DCD 0X0
	DCD 0X0
	DCD 0X0
	DCD 0X0
	DCD 0X0
	END
