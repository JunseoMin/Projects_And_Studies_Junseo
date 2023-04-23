import random
from timeit import default_timer as timer

def partition(A, p, r):
    x = A[r]
    i = p   #pivot
    ##############################
    for j in range(p,r):
        if(A[j]<=x):
            A[i],A[j]=A[j],A[i]
            i+=1
    ##############################
    A[i],A[r]= A[r],A[i]
    return i
#partition->sort

def qsort(A, p, r):
    if p < r:
        q = partition(A, p, r)
        qsort(A, p, q - 1)
        qsort(A, q + 1, r)
#reculsion -> give pivot

def quick_sort(A):
    qsort(A, 0, len(A)-1)

def test(A):
    for i in range(1, len(A)):
        if A[i-1] > A[i]:
            return False
    return True

x = random.sample(range(10000), 100)
start = timer()
quick_sort(x)
print(timer() - start)
print(x)
print(test(x))