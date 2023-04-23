import random
from timeit import default_timer as timer

def quick_sort(A):
    if len(A) <= 1:
        return A
    x = A[len(A) // 2]  # %안쓰고 // 쓰는 이유뭘까용..?
    less = []
    more = []
    equal = []
    for a in A:
        if a < x:
            less.append(a)
        elif a > x:
            more.append(a)
        else:
            equal.append(a)
    return quick_sort(less) + equal + quick_sort(more)

def test(A):
    for i in range(1, len(A)):
        if A[i-1] > A[i]:
            return False
    return True

x = random.sample(range(10000), 1000)
start = timer()
x = quick_sort(x)
print(timer() - start)
print(x)
print(test(x))

#bubble sort와 거의 2.6배차이 0.0019857999999999265/0.0007616999999999763