function openTab(evt, tabName) {
  var tabcontent = document.getElementsByClassName("tab-content");
  for (var i = 0; i < tabcontent.length; i++) {
      tabcontent[i].style.display = "none";
  }

  var tablinks = document.getElementsByClassName("tab-link");
  for (var i = 0; i < tablinks.length; i++) {
      tablinks[i].className = tablinks[i].className.replace(" active", "");
  }

  document.getElementById(tabName).style.display = "block";
  evt.currentTarget.className += " active";
}

document.addEventListener("DOMContentLoaded", function() {
  document.querySelector(".tab-link").click();
});
