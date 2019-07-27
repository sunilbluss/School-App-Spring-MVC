<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<a class="navbar-brand" href="javascript:void(0)">School App</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item ${requestScope['javax.servlet.forward.servlet_path'] == '/' ? 'active':''}"><a class="nav-link" href="<c:url value="/" />">Student</a></li>
			<li class="nav-item ${requestScope['javax.servlet.forward.servlet_path'] == '/course' ? 'active':''}"><a class="nav-link" href="<c:url value="/course" />">Course</a></li>
		</ul>
	</div>
</nav>