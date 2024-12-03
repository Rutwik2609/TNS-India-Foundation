let rolls = [0, 0, 0];
let currentPlayer = 1;

function rollDice(player) {
    const dice = document.getElementById(`dice${player}`);
    dice.classList.add('rolling');

    // Simulate the dice "rolling" multiple times
    let rollValue = Math.floor(Math.random() * 6) + 1;
    let rollInterval = setInterval(() => {
        rollValue = Math.floor(Math.random() * 6) + 1;
        dice.innerText = `🎲 ${rollValue}`;
    }, 100);

    // Stop rolling after a delay and show the final value
    setTimeout(() => {
        clearInterval(rollInterval);
        dice.classList.remove('rolling');
        rolls[player - 1] = rollValue;
        dice.innerText = `🎲 ${rollValue}`;
        document.getElementById(`rollBtn${player}`).disabled = true;

        if (player < 3) {
            nextPlayer(player + 1);
        } else {
            declareWinner();
        }
    }, 1000);  // Rolling animation duration set to 1 second
}

function nextPlayer(player) {
    document.getElementById(`player${currentPlayer}`).classList.remove('active');
    document.getElementById(`rollBtn${currentPlayer}`).disabled = true;

    currentPlayer = player;
    document.getElementById(`player${currentPlayer}`).classList.add('active');
    document.getElementById(`rollBtn${currentPlayer}`).disabled = false;

    document.getElementById("status").innerText = `Player ${currentPlayer}'s turn!`;
}

function declareWinner() {
    const maxRoll = Math.max(...rolls);
    const winners = rolls
        .map((roll, index) => (roll === maxRoll ? `Player ${index + 1}` : null))
        .filter(Boolean);
    const resultText = winners.length > 1
        ? `It's a tie between ${winners.join(" and ")} with a roll of ${maxRoll}`
        : `${winners[0]} wins with a roll of ${maxRoll}!`;

    document.getElementById("result").innerText = resultText;
    document.getElementById("status").innerText = "Game Over!";
    document.getElementById("resetBtn").style.display = "block";
}

function resetGame() {
    rolls = [0, 0, 0];
    currentPlayer = 1;
    document.getElementById("status").innerText = "Player 1's turn!";
    document.getElementById("result").innerText = "Press roll for each player to see who wins!";
    document.getElementById("resetBtn").style.display = "none";

    for (let i = 1; i <= 3; i++) {
        document.getElementById(`dice${i}`).innerText = "🎲";
        document.getElementById(`rollBtn${i}`).disabled = i !== 1;
        document.getElementById(`player${i}`).classList.remove('active');
    }
    document.getElementById("player1").classList.add("active");
}