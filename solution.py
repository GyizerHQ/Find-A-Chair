l=[["xxx",3],["xxxxx",6],["xxxxxx",9],["xxx",5]]
s=0
n=4
l1=list()
for i in range(0,len(l)):
    res=(l[i][1])-len(l[i][0])
    s+=res
    print(res)
    l1.append(res)
    if(s>=n):
        break
print(l1)
