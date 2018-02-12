Hook NameCorrect
================

# (pre-commit or pre-push)
# Make sure my email is set properly
useremail=$(git config user.email)
 
if [ "$useremail" != "tygerbytes@users.noreply.github.com" ]
then
    cat <<\EOF
Error: user.email not set to "tygerbytes@users.noreply.github.com"
EOF
    exit 1
fi