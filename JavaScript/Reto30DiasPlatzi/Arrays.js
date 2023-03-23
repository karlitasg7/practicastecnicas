function findFamousCats(cats) {

    cats.forEach(cat => {
        cat.sumFollowers = cat.followers.reduce((sum, num) => {
            return sum + num;
        }, 0);
    });

    const maxFollowers = cats
        .map(cat => cat.sumFollowers)
        .sort((a, b) => b - a)
        [0];

    return cats
        .filter(cat => cat.sumFollowers === maxFollowers)
        .map(cat => cat.name);

}

console.log(findFamousCats([
        {
            name: "Luna",
            followers: [500, 200, 300]
        },
        {
            name: "Michi",
            followers: [100, 300]
        },
    ])
);
