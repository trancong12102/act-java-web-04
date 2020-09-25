; ¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤

    include \masm32\include64\masm64rt.inc
extrn printf:proc
    .data?
    buff  db 255 dup(?)
	check db	?
	.data
aMSg	db		"Chuong trinh tim va dong cac cua so trinh duyet sau moi 5s",0Ah, 0
aS_1            db '%s',0Ah,0 
aBrowser1 db	 "Google Chrome", 0
aBrowser2 db	"Opera", 0
aBrowser3 db	"Internet Explorer", 0
aBrowser4 db	"Microsoft? Edge", 0
aBrowser5 db	"C?c C?c", 0
aBrowser6 db	"Firefox", 0
    .code

; ¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤
.code


EnumWindowsProc proc hWnd:HWND , lParam :LPARAM 

	push    rbp
	mov 	rbp, rsp
	sub     rsp, 20h
	mov     [rbp+ 10h], rcx;hwnd
	mov     [rbp+ 18h], rdx; lParam

	mov     rcx, [rbp+ 10h] ; hWnd
	call    IsWindowVisible
	test    eax, eax
	setnz   al
	test    al, al
	jz      @EmunWindowsRet
;----------------0
	mov     r8d, 0FEh       ; nMaxCount
	lea     rdx, buff       ; lpString
	mov     rcx, [rbp+ 10h] ; hWnd
	call    GetWindowTextA
	
	lea		r8, aBrowser1
	mov		edx, 0
	lea 	rcx, buff
	call    StrRStrIA
	test	rax, rax
	setnz 	al
	test 	al,al
	jz      @Browser2
	jmp 	@closeBrowser
;---------------1

@Browser2:
	lea		r8, aBrowser2
	mov		edx, 0
	lea 	rcx, buff
	call    StrRStrIA
	test	rax, rax
	setnz 	al
	test 	al,al
	jz      @Browser3
	jmp 	@closeBrowser
;--------------3

@Browser3:
	lea		r8, aBrowser3
	mov		edx, 0
	lea 	rcx, buff
	call    StrRStrIA
	test	rax, rax
	setnz 	al
	test 	al,al
	jz      @Browser4
	jmp 	@closeBrowser
;--------------5

@Browser4:
	lea		r8, aBrowser4
	mov		edx, 0
	lea 	rcx, buff
	call    StrRStrIA
	test	rax, rax
	setnz 	al
	test 	al,al
	jz      @Browser5
	jmp 	@closeBrowser
;---------------7
  

@Browser5:
	lea		r8, aBrowser5
	mov		edx, 0
	lea 	rcx, buff
	call    StrRStrIA
	test	rax, rax
	setnz 	al
	test 	al,al
	jz      @Browser6
	jmp 	@closeBrowser
;----------------

@Browser6:
	lea		r8, aBrowser6
	mov		edx, 0
	lea 	rcx, buff
	call    StrRStrIA
	test	rax, rax
	setnz 	al
	test 	al,al
	jz        @EmunWindowsRet
	jmp 	@closeBrowser
;-----------------
  
@closeBrowser:
lea     rdx, buff
lea     rcx, aS_1       ; "%s\n"  
	call 	printf
	mov     r9d, 0          ; lParam
	mov     r8d, 0          ; wParam
	mov     edx, 10h        ; Msg
	mov     rcx, [rbp+ 10h] ; hWnd
	call    SendMessageA
	ret
;============
@EmunWindowsRet:
	mov     eax, 1
	add     rsp, 20h
	pop     rbp
	leave
	ret
EnumWindowsProc endp


start PROC
	push    rbp
	mov     rbp, rsp
	sub     rsp, 20h
	mov 	[rbp+10h], ecx
	mov		[rbp+18h], rdx
	mov 	[rbp+20h], r8	;hwnd
	;call    __main
	;lea 	rcx, aMsg
lea     rdx, aMSg
lea     rcx, aS_1
call    printf

@TimeLoop:
mov     edx, 0
;lea     rcx, EnumWindowsProc ; lpEnumFunc
call	EnumWindowsProc
;mov 	rax, eax
call    EnumWindows
mov     rax, [rbp+10h]
mov     r9d, 0          ; lpTimerFunc
mov     r8d, 5000      ; uElapse
mov     edx, 1          ; nIDEvent
mov     rcx, rax        ; hWnd
call    SetTimer
jmp     @TimeLoop	

quit:
	mov rax, 0
	leave
	ret
start ENDP
END
