var Zid=Ze;function Zjd(){Zid=Zc}function Zkd(a){if(a!=Zd){for(var b=a.nextSibling;b&&"LI"!=b.tagName&&"UL"!=b.tagName;)b=b.nextSibling;if(!b||"LI"==b.tagName)for(b=a.firstChild;b&&"UL"!=b.tagName;)b=b.nextSibling;return b}}function Zld(a){a.stopPropagation();if(!Zid){a=a.target;var b=Zkd(a);b&&("treeopen"==a.className?(a.className="",b.className=""):(a.className="treeopen",b.className="treeleafcontainer"))}}var Zmd=Zb;
function Znd(a){if(a)for(a=a.firstChild;a;){if("LI"==a.tagName){for(var b=a.firstChild;b&&"A"!=b.tagName;)b=b.nextSibling;if(b&&"A"==b.tagName&&(ZF(b,"click",Zjd),document.location.href.split("?")[0]==b.href||document.location.href.split("#")[0]==b.href))Zmd=b;(b=Zkd(a))?(ZF(a,"click",Zld),Znd(b)):a.className="treeleaf"}a=a.nextSibling}}Znd(Zkd(Zx("sidebarcontainer")));
if(Zmd){Zmd.className="currentpagelink";for(var Zod=Zmd.parentNode.parentNode;Zod&&"UL"==Zod.tagName;){Zod.className="treeleafcontainer";for(var Z6=Zod.previousSibling;Z6&&"LI"!=Z6.tagName;)Z6=Z6.previousSibling;Z6&&"LI"==Z6.tagName&&(Z6.className="treeopen");Zod=Zod.parentNode}var Zpd=Zmd.parentNode;if(!Zpd.className){var Zqd=Zkd(Zpd);Zqd&&(Zpd.className="treeopen",Zqd.className="treeleafcontainer")}}
_DW_toggleSidebar=function(a){a=Zvc(a);CS_env.token&&ZU(CS_env.projectHomeUrl+"/w/setSidebarPref.do",Zca,{expanded:a?1:0})};function Zrd(a){a=ZP(a);var b=Zx("wikimaincol");b.innerHTML=a.preview_html;prettyPrint();gapi.plusone.go(b)}_DW_syncPreview=function(a){ZU(CS_env.projectHomeUrl+"/w/syncWikiPreviewJSON",Zrd,{content:a})};
