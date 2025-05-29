;Name - Arpit Kumar Mohanty
;Registration Number - 2341013237
;Lab - 3
;Obj - 1(a) // Find the Largest number(8-bit) from the given array of size n

.data
count db 04h                ; count = array size (N = 4)
value db 12h,0ch,05h,15h    ; array elements
res db ?                    ; variable to store the result

.code
MAIN PROC
 mov ax, data              ; AX <- address of data segment
 mov ds, ax                ; DS <- AX (initialize DS with data segment address)
 mov cl, count             ; CL <- count (load array size)
 dec cl                    ; CL <- CL - 1 (since first element is preloaded)
 LEA SI, value             ; SI <- offset of value (point to start of array)
 mov al, [SI]              ; AL <- value[0] (assume first element is max)

up: inc si                 ; SI <- SI + 1 (point to next element)
 cmp al, [si]              ; Compare AL with value[SI]
 jnc nxt                   ; If AL >= value[SI], jump to nxt
 ; jnl nxt                 ; (alternative: jump if not less)
 mov al, [si]              ; AL <- value[SI] (new max found)

nxt: dec cl                ; CL <- CL - 1 (decrease loop counter)
 jnz up                   ; If CL != 0, jump to up (repeat loop)

 LEA DI, res              ; DI <- offset of res
 mov [DI], al             ; res <- AL (store max value in res)

END MAIN                 ; End of program