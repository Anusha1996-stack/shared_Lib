import os 
import stat

#def call (signtype, certificate, filetobesigned, dirforsignedfiles) {
#    if ( signtype == "openSSL") {
def python_call(one):
  if (one == 1):
    st = os.stat('./myfile/f1.py')
    os.chmod('./myfile/f1.py', st.st_mode | stat.S_IEXEC)
    os.system('python ./myfile/f1.py ')

#    }
#}
