function doTask1_bad(callback) {
    setTimeout(() => callback('Task 1'), 300);
}

function doTask2_bad(callback) {
    setTimeout(() => callback('Task 2'), 300);
}

function doTask3_bad(callback) {
    setTimeout(() => callback('Task 3'), 300);
}

function runCode_bad() {
    const strings = [];
    return new Promise((resolve) => {
        doTask1_bad((rta1) => {
            strings.push(rta1);
            doTask2_bad((rta2) => {
                strings.push(rta2);
                doTask3_bad((rta3) => {
                    strings.push(rta3);
                    resolve(strings);
                })
            })
        })
    })
}

runCode_bad()
    .then(response => console.log(response));

// ********** refactor using promises **********

function doTask1() {
    return new Promise((resolve) => {
        setTimeout(() => resolve('Task 1', 300))
    });
}

function doTask2() {
    return new Promise((resolve) => {
        setTimeout(() => resolve('Task 2', 300))
    });
}

function doTask3() {
    return new Promise((resolve) => {
        setTimeout(() => resolve('Task 3', 300))
    });
}

function runCode() {
    const strings = [];
    return doTask1()
        .then(rta => {
            strings.push(rta)
            return doTask2();
        })
        .then(rta => {
            strings.push(rta)
            return doTask3();
        })
        .then(rta => {
            strings.push(rta)
            return strings;
        });
}

runCode()
    .then(response => console.log(response));
