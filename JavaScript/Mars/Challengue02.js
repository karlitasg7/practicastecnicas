function balanceEnergy(energy) {
  const totalEnergy = energy.reduce((acc, curr) => acc + curr, 0);
  const averageEnergy = Math.floor(totalEnergy / energy.length);
  const leftover = totalEnergy - averageEnergy * energy.length;

  const balanced = energy.map(() => averageEnergy);

  return { balanced, leftover };
}

console.log(balanceEnergy([1, 2, 3, 4]));
console.log(balanceEnergy([1, 3, 2]));
console.log(balanceEnergy([4, 6, 4]));
console.log(balanceEnergy([1, 1]));
