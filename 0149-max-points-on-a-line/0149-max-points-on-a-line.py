class Solution:
    def maxPoints(self, points: List[List[int]]) -> int:
        n = len(points)
        if n <= 2:
            return n
        res = 2
        for i in range(n):
            for j in range(i+1, n):
                temp = 2
                for k in range(j+1, n):                   
                    x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0])
                    y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0])
                    if x == y:
                        temp += 1
                if temp > res:
                    res = temp
        return res
    
    
