function reverseWords(sentence) {
    return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}
let inputSentence = "This is a sunny day";
let reversedWords = reverseWords(inputSentence);
console.log("Reversed Words:", reversedWords);
