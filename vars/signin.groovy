/*import os 
import stat

def call (signtype, certificate, filetobesigned, dirforsignedfiles) {
#    if ( signtype == "openSSL") {
def pythoncall(one):
  if (one == 1):
    st = os.stat('./myfile/f1.py')
    os.chmod('./myfile/f1.py', st.st_mode | stat.S_IEXEC)
    os.system('python ./myfile/f1.py ')
*/
def runMyPython() {
  final pythonContent = libraryResource('./myfile/f1.py')
  // There are definitely better ways to do this without having to write to the consumer's workspace
  writeFile(file: 'f1.py', text: pythonContent)
  sh('chmod +x f1.py && ./f1.py')
}

