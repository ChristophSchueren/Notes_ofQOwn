# Commandline snippets

choco list --localonly

Chocolatey v0.10.8
chocolatey 0.10.8
chocolateygui 0.15.0
jdk8 8.0.152
maven 3.5.2
nodejs 9.3.0
nodejs-lts 8.9.3
nodejs.install 9.3.0
yarn 1.3.2
yo 2.0.0

xcopy *.txt *.md

## Install chocolate (NEEDS CMD with ADMIN rights):
@"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -ExecutionPolicy Bypass -Command "iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"


then
choco install chocolate_packageList.config