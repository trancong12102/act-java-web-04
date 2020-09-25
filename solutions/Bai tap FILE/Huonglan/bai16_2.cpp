#include <windows.h>
#include <string>
#include <iostream>
#include <Shlwapi.h>
char buff[255];
char strbrowser[] = "Google Chrome";
char strbrowser1[] = "Opera";
char strbrowser2[] = "Internet Explorer";
char strbrowser3[] = "Microsoft? Edge";
char strbrowser4[] = "C?c C?c";
char strbrowser5[] = "Firefox";
BOOL CALLBACK EnumWindowsProc(HWND hwnd, LPARAM lParam) {

if(IsWindowVisible(hwnd)){
	GetWindowText(hwnd, (LPSTR)buff, 254);
//	printf("%s\n", buff);

	if (StrRStrIA((LPSTR)buff, NULL, (LPSTR)(strbrowser)) != 0 ) {
	//	printf("check result:%d\n\n", check);
	printf("%s\n", buff);
		SendMessage(hwnd, WM_CLOSE, 0, 0);
	}

	if (StrRStrIA((LPSTR)buff, NULL, (LPSTR)(strbrowser1)) != 0 ) {
		printf("%s\n", buff);
		SendMessage(hwnd, WM_CLOSE, 0, 0);
	}

	if (StrRStrIA((LPSTR)buff, NULL, (LPSTR)(strbrowser2)) != 0 ) {
		printf("%s\n", buff);
		SendMessage(hwnd, WM_CLOSE, 0, 0);
	}

	if (StrRStrIA((LPSTR)buff, NULL, (LPSTR)(strbrowser3)) != 0 ) {
		printf("%s\n", buff);
		SendMessage(hwnd, WM_CLOSE, 0, 0);
	}

	if (StrRStrIA((LPSTR)buff, NULL, (LPSTR)(strbrowser4)) != 0 ) {
		printf("%s\n", buff);
		SendMessage(hwnd, WM_CLOSE, 0, 0);
	}

	if (StrRStrIA((LPSTR)buff, NULL, (LPSTR)(strbrowser5)) != 0 ) {
		printf("%s\n", buff);
		SendMessage(hwnd, WM_CLOSE, 0, 0);
	}
//timerID = SetTimer(hwnd, timerID, 5000, NULL);	
}
return TRUE;
}
	int main(int argc, char** argv,HWND hwnd ) {
	printf("Chuong trinh tim va dong cac cua so trinh duyet sau moi 5s\n");
	do{
		EnumWindows(EnumWindowsProc, 0);
		SetTimer(hwnd, 1, 5000, NULL);		
	}while(TRUE);
		return 0;
}
