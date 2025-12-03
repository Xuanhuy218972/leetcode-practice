# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    seen = {}
    nums.each_with_index do |num, index|
        need_number = target - num
        if seen.key?(need_number)
        return [seen[need_number],index]
        else
        seen[num] = index
        end
    end
end
