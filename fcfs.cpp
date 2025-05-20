#include <iostream>
#include <limits>
#include <vector>
#include <iomanip>

using namespace std;

const int MAX_PROCESSES = 100;

int getValidInt(const string& prompt, int min, int max) {
    int value;
    while (true) {
        cout << prompt;
        cin >> value;

        if (cin.fail()) {
            cin.clear(); // clear error state
            cin.ignore(numeric_limits<streamsize>::max(), '\n'); // discard invalid input
            cout << " Invalid input! Please enter an integer." << endl;
        } else if (value < min || value > max) {
            cout << " Value must be between " << min << " and " << max << "." << endl;
        } else {
            return value;
        }
    }
}

void calculateWaitingTime(const vector<int>& burst_time, vector<int>& waiting_time, int n) {
    waiting_time[0] = 0;
    for (int i = 1; i < n; ++i) {
        waiting_time[i] = waiting_time[i - 1] + burst_time[i - 1];
    }
}

void calculateTurnaroundTime(const vector<int>& burst_time, const vector<int>& waiting_time, vector<int>& turnaround_time, int n) {
    for (int i = 0; i < n; ++i) {
        turnaround_time[i] = waiting_time[i] + burst_time[i];
    }
}

void displayResults(const vector<int>& burst_time, const vector<int>& waiting_time, const vector<int>& turnaround_time, int n) {
    float avg_waiting_time = 0, avg_turnaround_time = 0;

    cout << "\nProcess\tBurst Time\tWaiting Time\tTurnaround Time\n";
    for (int i = 0; i < n; ++i) {
        cout << "P" << i + 1 << "\t\t" << burst_time[i] << "\t\t" << waiting_time[i] << "\t\t" << turnaround_time[i] << endl;
        avg_waiting_time += waiting_time[i];
        avg_turnaround_time += turnaround_time[i];
    }

    cout << fixed << setprecision(2);
    cout << "\n Average Waiting Time: " << avg_waiting_time / n;
    cout << "\n Average Turnaround Time: " << avg_turnaround_time / n << endl;
}

int main() {
    int n = getValidInt("Enter the number of processes (1 to 100): ", 1, MAX_PROCESSES);

    vector<int> burst_time(n), waiting_time(n), turnaround_time(n);

    cout << "Enter the burst time for each process:\n";
    for (int i = 0; i < n; ++i) {
        string prompt = "Process " + to_string(i + 1) + ": ";
        burst_time[i] = getValidInt(prompt, 0, 100000);
    }

    calculateWaitingTime(burst_time, waiting_time, n);
    calculateTurnaroundTime(burst_time, waiting_time, turnaround_time, n);
    displayResults(burst_time, waiting_time, turnaround_time, n);

    return 0;
}
