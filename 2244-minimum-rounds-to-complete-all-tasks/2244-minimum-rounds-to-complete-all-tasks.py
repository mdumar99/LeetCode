class Solution:
    def minimumRounds(self, tasks: List[int]) -> int:
        frequency = Counter(tasks)
        result = 0
        for f in frequency.values():
            if f == 1:
                return -1
            elif (f-2)%3 == 0:
                result += (f-2)//3+1
            elif (f-4)%3 == 0:
                result += (f-4)//3+2
            elif f%3 == 0:
                result += f//3
            else:
                res += f//2
        return result
