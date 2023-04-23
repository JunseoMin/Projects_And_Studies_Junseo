#fibonacci elements
def FIB(n):
    if n==1 or n==2:
        return 1
    else:
        return FIB(n-1)+FIB(n-2)
    
    
#fibonacci array
arr=[0,0,0,0,0]
for a in range(len(arr)):
    arr[a]=FIB(a+1)
print(arr)