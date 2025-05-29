;Name: Arpit Kumar Mohanty
;Registration Number: 2341013237
;Lab: 5     
;Objective: 2	//Find the smallest number in each array of size N

    AREA PROG1, CODE,READONLY 
    ENTRY 
START 
    ;Smallest number from a given array 
    ldr r0,=count 
    ldr r1,[r0] 
    ldr r2,=array 
    ldr r3, [r2],#4     ; Load first element into r3 as initial smallest

back 
    subs r1,r1,#01      ; Decrement count
    beq fwd             ; If count is 0, branch to fwd
    ldr r4,[r2],#4      ; Load next element into r4
    cmp r3,r4           ; Compare current smallest (r3) with new value (r4)
    blt back            ; If r3 < r4, keep current smallest
    mov r3,r4           ; Else, update smallest
    b back              ; Repeat

fwd  
    ldr r5,=LARGEST     ; Final result storage address
    str r3,[r5]         ; Store the smallest value in memory
exit 
    b exit              ; Infinite loop (end)

count DCD 0x07 
array  
    DCD 0x15  ;	DCD= Define Constant Double-words(32-bit)   
    DCD 0x35  ; DCD directive allocates one or more words of memory, aligned  
			; on 4-byte boundaries
    DCD 0x32 
    DCD 0x45 
    DCD 0x10 
    DCD 0x4f 
    DCD 0x34 

    AREA DATA2,DATA,READWRITE 
LARGEST  DCD 0X0 
    END