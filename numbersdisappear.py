class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n=len(nums)
        all_nums= set(range(1,n+1))
        return list(all_nums - set(nums))
