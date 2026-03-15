function isPalindrome(s: string): boolean {
    const originalString: string = s.replace(/[^a-zA-Z0-9]/g, "").toLowerCase();

    if (originalString === reverseStringWithReduce(originalString)){
        return true;
    }else{
        return false;
    }
};

function reverseStringWithReduce(str: string): string {
    return str.split('').reduce((reversed, character) => character + reversed, '');
}