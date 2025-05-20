#include <stdio.h>

#define MAX_PROCESSES 100

int getValidInt(const char *prompt, int min, int max) {
    int value;
    char ch;
    while (1) {
        printf("%s", prompt);
        if (scanf("%d", &value) != 1) {
            while ((ch = getchar()) != '\n' && ch != EOF);
            printf("Invalid input! Please enter an integer.\n");
        } else if (value < min || value > max) {
            printf("Value must be between %d and %d.\n", min, max);
        } else {
            return value;
        }
    }
}

void calculateWaitingTime(int burst_time[], int waiting_time[], int n) {
    waiting_time[0] = 0;
    for (int i = 1; i < n; i++) {
        waiting_time[i] = waiting_time[i - 1] + burst_time[i - 1];
    }
}

void calculateTurnaroundTime(int burst_time[], int waiting_time[], int turnaround_time[], int n) {
    for (int i = 0; i < n; i++) {
        turnaround_time[i] = waiting_time[i] + burst_time[i];
    }
}

void displayResults(int burst_time[], int waiting_time[], int turnaround_time[], int n) {
    float avg_waiting_time = 0, avg_turnaround_time = 0;

    printf("\nProcess\tBurst Time\tWaiting Time\tTurnaround Time\n");
    for (int i = 0; i < n; i++) {
        printf("P%d\t\t%d\t\t%d\t\t%d\n", i + 1, burst_time[i], waiting_time[i], turnaround_time[i]);
        avg_waiting_time += waiting_time[i];
        avg_turnaround_time += turnaround_time[i];
    }

    printf("\nAverage Waiting Time: %.2f", avg_waiting_time / n);
    printf("\nAverage Turnaround Time: %.2f\n", avg_turnaround_time / n);
}

int main() {
    int n, burst_time[MAX_PROCESSES], waiting_time[MAX_PROCESSES], turnaround_time[MAX_PROCESSES];

    n = getValidInt("Enter the number of processes (1 to 100): ", 1, MAX_PROCESSES);

    printf("Enter the burst time for each process:\n");
    for (int i = 0; i < n; i++) {
        char prompt[20];
        snprintf(prompt, sizeof(prompt), "Process %d: ", i + 1);
        burst_time[i] = getValidInt(prompt, 0, 100000);
    }

    calculateWaitingTime(burst_time, waiting_time, n);
    calculateTurnaroundTime(burst_time, waiting_time, turnaround_time, n);
    displayResults(burst_time, waiting_time, turnaround_time, n);

    return 0;
}
