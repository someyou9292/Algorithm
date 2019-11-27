package Level2_SkillTree;

class Solution {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		char[] skillArr = skill.toCharArray();

		for (int i = 0; i < skill_trees.length; i++) {
			boolean isAble = true;
			for (int j = 1; j < skillArr.length; j++) {
				int preSkill = skill_trees[i].indexOf(skillArr[j-1]);
				int postSkill = skill_trees[i].indexOf(skillArr[j]);
				
				if(preSkill > postSkill && postSkill != -1) {
					isAble = false;
					break;
				}
				if(preSkill == -1 && postSkill != -1) {
					isAble = false;
					break;
				}
			}
			if(isAble == true) {
				answer++;
			}
		}
		
		System.out.println(answer);

		return answer;
	}
}

public class SkillTree {
	public static void main(String[] args) {
		Solution st = new Solution();
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };

		st.solution(skill, skill_trees);
	}
}
