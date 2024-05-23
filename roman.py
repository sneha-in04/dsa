s="IV"
new_str=list(s.split())
length=len(new_str)
I=1
V=5
X=10
L=50
C=100
D=500
M=1000
for i in range(length+1):
  if new_str[0]=='I' and new_str[1]=='V' or new_str[1]=='X':
    print(new_str[1]-new_str[0])