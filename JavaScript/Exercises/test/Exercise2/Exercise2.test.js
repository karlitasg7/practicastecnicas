const palindrome = require('./Exercise2-palindrome');

test("check if function is defined", () => {
    expect(palindrome).toBeDefined();
})

test("check if word is palindrome", () => {
    expect(palindrome("otto")).toEqual(true);
})

test("check if word isn't palindrome", () => {
    expect(palindrome("karla")).toBe(false);
})
