Tesseract Friware OCR
=====================

eher linux
open source

script fähig

> For a free solution with Tesseract, here's a straightforward command line batch file. Change the variable contents and/or create folders as necessary:

```
:Start
   @Echo off
   Set _SourcePath=C:\tifs\*.tif
   Set _OutputPath=C:\txts\
   Set _Tesseract="C:\Program Files (x86)\Tesseract-OCR\tesseract.exe"
:Convert
   For %%A in (%_SourcePath%) Do Echo Converting %%A...&%_Tesseract% %%A %_OutputPath%%%~nA
:End   
   Set "_SourcePath="
   Set "_OutputPath="
   Set "_Tesseract="
```
**VietOCR.NET** is a GUI for Tesseract private

hat Option Datei-Bar oben:

**Command > Bulk OCR**

can export to .txt in different folder