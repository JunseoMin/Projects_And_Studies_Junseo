import random

'''insertion sort using in shellsort'''
def insertion_sort(list,first,h):
    for i in range(first,len(list),h):
            loc=i-h
            newitem=list[i]
            while loc>=0 and (newitem<=list[loc]):
                list[loc+h],list[loc]=list[loc],list[loc+h]
                loc-=h             
    return list


def shellsort(list,h):
    
    for i in range(len(list)):
        if i+h>len(list):
            return list
        list=insertion_sort(list,i,h)


randlist=random.sample(range(0,100),100)
print(randlist)
print(shellsort(randlist,57))
print(shellsort(randlist,23))
print(shellsort(randlist,11))
print(shellsort(randlist,7))