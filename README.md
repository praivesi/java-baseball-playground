# 기능목록
1. 같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 또는 낫싱이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.

    - (e.g. 상대방(컴퓨터)의 수가 425일 때, 123을 제시한 경우 : 1스트라이크, 456을 제시한 경우 : 1볼 1스트라이크, 789를 제시한 경우 : 낫싱)

    - [X] 공 두 개가 주어질 때, 수와 위치를 비교하여 스트라이크/볼/낫싱을 판별한다.
    - [ ] 게임 플레이어의 공 하나와 상대방 공 3개가 주어질 때, 스트라이크/볼/낫싱을 판별한다.
    - [ ] 게임 플레이어의 공 3개와 상대방 공 3개가 주어질 때, 스트라이크/볼/낫싱의 횟수를 카운트한다.


2. 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택한다. 게 임 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력하고, 컴퓨터는 입력한 숫자에 대한 결과를 출력한다.
    - [ ] 1~9사이 숫자 중 하나를 랜덤으로 생성한다.
    - [ ] 1~9사이 랜덤 숫자를 3개 생성한다.
    - [ ] 1~9사이 랜덤 숫자 3개를 컴퓨터측 공으로 보관한다.
    - [ ] 콘솔 창에서 게임 플레이어의 숫자를 입력받는 Input 모듈을 만든다.
    - [ ] 게임 플레이어가 입력하는 숫자 1개를 입력받는다.
    - [ ] 게임 플레이어가 입력하는 숫자 3개를 모두 입력받는다.
    - [ ] 게임 플레이어에게 입력받은 숫자 3개를 컴퓨터측 공과 비교하여 스트라이크/볼/낫싱 횟수를 카운트한다.
    - [ ] 게임의 최종 결과를 콘솔 창에 출력하는 Output 모듈을 만든다.


3. 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
    - [ ] 게임 플레이어의 숫자 3개와 컴퓨터의 숫자 3개가 모두 맞을 경우 게임 루프를 종료한다.


4. 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
    - [ ] 한 게임이 종료된 후 게임의 '다시 시작' 혹은 '완전한 종료'를 게임 플레이어에게 질의한다.
    - [ ] 사용자가 '다시 시작'을 선택한 경우 게임을 처음부터 재개한다.
    - [ ] 사용자가 '완전한 종료'를 선택한 경우 게임을 완전히 Exit한다.
