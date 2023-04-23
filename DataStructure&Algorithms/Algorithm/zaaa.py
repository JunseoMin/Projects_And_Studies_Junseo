import numpy as np

# 회전 각도 (30도)
theta = np.radians(30)

# 회전 행렬
R = np.array([[np.cos(theta), -np.sin(theta), 0],
              [np.sin(theta), np.cos(theta), 0],
              [0, 0, 1]])

# 변위 벡터
t = np.array([[3], [4], [0]])

# 변환 행렬
T = np.vstack((np.hstack((R, t)), np.array([0, 0, 0, 1])))
print(T)
# 역변환 행렬
inv_T = np.linalg.inv(T)

print(inv_T)
