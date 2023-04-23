matrix=[[6,7,12,5],[5,3,11,18],[7,17,3,3],[8,10,14,9]]


def S_R(i,j):
    if(i==0 and j == 0):
        return matrix[0][0]
    
    # check for array index
    if i==0:
        return matrix[i][j]+S_R(i,j-1)
    # check for array index
    if j==0:
        return matrix[i][j]+S_R(i-1,j)
    else:
        return matrix[i][j]+max(S_R(i-1,j),S_R(i,j-1))
        
print(S_R(3,3))