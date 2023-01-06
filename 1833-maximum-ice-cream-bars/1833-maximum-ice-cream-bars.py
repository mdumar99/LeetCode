class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        costs.sort()
        icBars = 0
        for cost in costs:
            if cost > coins:
                break
            coins -= cost
            icBars += 1
        return icBars