class Solution {
    public String defangIPaddr(String address) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i)=='.') {
                s.append("[.]");
            } else {
                s.append(address.charAt(i));
            }
        }

        return s.toString();

    }
}