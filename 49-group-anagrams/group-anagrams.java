class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        int n = s.length;
        for (int i = 0; i < n; i++) {
            char[] ch = s[i].toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            List<String> keyList = map.get(key);
            keyList.add(s[i]);
        }

        for (List<String> list : map.values()) {
            ans.add(list);
        }

        return ans;
    }
}
