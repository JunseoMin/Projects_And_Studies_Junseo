import random
from timeit import default_timer as timer

class Node(object):
    def __init__(self, key, parent):
        self.key = key
        self.left = None
        self.right = None
        self.parent = parent


'''pseudo code
DELETE-NODE(r)
    if r.left == NIL and r.right == NIL
        return NIL
    else if r.left != NIL and r.right == NIL
        return r.left
    else if r.right != NIL and r.left == NIL
        return r.right
    else
        s = r.right
        while s.left != NIL
            parent = s
            s = s.left
        r.key = s.key
        if s == r.right
            r.right = s.right
        else
            parent.left = s.right
        return r
'''

def Delete_Node(r):
    if (r.left==None and r.right==None):
        return None
    elif(r.left!=None and r.right==None):
        return r.left
    elif(r.right!=None and r.left==None):
        return r.right
    else:
        s=r.right
        while s.left!=None:
            parent=s
            s=s.left
        r.key=s.key
        if(s==r.right):
            r.right=s.right
        else:
            parent.left=s.right
        return r