class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        n = len(gas)
        curGas = 0
        stStn = 0
        totGas = 0
        
        for i in range(n):
            totGas += gas[i] - cost[i]
            curGas += gas[i] - cost[i]
            if curGas < 0 :
                stStn = i + 1
                curGas = 0
    
        return -1 if totGas < 0 else stStn
                    
        