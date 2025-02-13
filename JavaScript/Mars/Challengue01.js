function decodeMessage(message) {
  const numberMap = {
    0: "o",
    1: "i",
    3: "e",
    4: "a",
    5: "s",
    7: "t",
  };

  let newMessage = message.replace(/[013457]/g, (match) => numberMap[match]);

  const chars = newMessage.split("");
  for (let i = 0; i < chars.length; i++) {
    if (chars[i] === ">") {
      [chars[i - 1], chars[i + 1]] = [chars[i + 1], chars[i - 1]];
      chars[i] = "";
    } else if (chars[i] === "*") {
      chars[i] = "";
      chars[i + 1] = "";
    }
  }

  return chars.join("").replace(/[^a-zA-Z0-9\s¿?!¡áéíóúÁÉÍÓÚñÑ]/g, "");
}

console.log(decodeMessage("a*bc>d")); // "adc"
console.log(decodeMessage("†¡H$0*l4>l!║¤")); // "¡Hola!"
