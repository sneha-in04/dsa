name="""Mary had a little lamb little lamb little lamb
Mary had a little lamb its fleece  white  snow."""
stop_word="""a as its"""
#len_name=len(name)
#str_name=[len_name]
#i=0
#for char in name:
    #if char in stop_word:
        #continue
   # str_name[i]=char
    #i+=1
#print(str_name)  
n=name.split()
s=stop_word.split()
filter=[i for i in n if i not in s]
fl=' '.join(filter)
print(fl)
fln=fl.split()
d={}
a=len(fl)
for j in fln:
    if j in d:
        d[j]=d[j]+1
    else:
        d[j]=1
print(d)



