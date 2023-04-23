#자리->index->자리
import random
from timeit import default_timer as timer

def counting_sort(A, k):
    B = [0] * len(A)
    C = [0] * (k+1)
    for v in A:
        C[v] += 1
    #개수
    print(C)
    for i in range(1, k+1):
        C[i] += C[i-1]
    #index
    print(C)
    
    for i in range(len(A)-1, -1, -1):
        v = A[i]
        C[v] -= 1
        B[C[v]] = v
    print(C)
        
    return B

def test(A):
    for i in range(1, len(A)):
        if A[i-1] > A[i]:
            return False
    return True

x = random.choices(range(50), k=10)
start = timer()
print(x)
x = counting_sort(x, 49)
#print(timer() - start)
#print(x)
print(test(x))
