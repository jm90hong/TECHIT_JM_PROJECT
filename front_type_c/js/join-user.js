const idInput = document.getElementById('id');
const pwInput = document.getElementById('pw');
const pwChkInput = document.getElementById('pw-chk');
const nickInput = document.getElementById('nick');
const addressInput = document.getElementById('address');
const interestSelect = document.getElementById('interest');
const saveBtn = document.getElementById('save-btn');

// 회원가입 버튼 클릭시 유효성 검사 함수
function validateForm() {
    const id = idInput.value.trim();
    const pw = pwInput.value.trim();
    const pwChk = pwChkInput.value.trim();
    const nick = nickInput.value.trim();
    const address = addressInput.value.trim();
    const interest = interestSelect.value.trim();

    if (!id || !pw || !pwChk || !nick || !address || !interest) {
        alert('모든 필드를 입력해주세요.');
        return false;
    }
    
    if (pw !== pwChk) {
        alert('비밀번호가 일치하지 않습니다.');
        return false;
    }

    // 모든 검사를 통과하면 true를 반환
    return true;
}

// 버튼 클릭 이벤트 리스너 추가
saveBtn.addEventListener('click', function(event) {
    if (!validateForm()) {
        event.preventDefault(); // 폼이 제출되지 않도록 함
    } else {
        // 회원가입 로직 추가
        alert('회원가입이 완료되었습니다.');
    }
});