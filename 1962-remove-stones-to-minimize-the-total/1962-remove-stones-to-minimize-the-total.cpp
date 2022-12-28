class Solution {
public:
    int minStoneSum(std::vector<int>& piles, int k) {
    std::vector<int> frequency(10001, 0);
    int max_pile = -1;
    for (int p : piles) {
      frequency[p]++;
      max_pile = std::max(max_pile, p);
    }

    for (int i = max_pile; i >= 1 && k > 0; i--) {
      while (frequency[i] != 0 && k > 0) {
        frequency[i]--;
        frequency[(i + 1) / 2]++;
        k--;
      }
    }

    int ans = 0;
    for (int i = max_pile; i > 0; i--) {
      ans += frequency[i] * i;
    }
    return ans;
    }
};

