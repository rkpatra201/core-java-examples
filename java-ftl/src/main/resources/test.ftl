FreeMarker Template example: ${message}

<#if type == "INT" || type == "STRING">
<#assign x=type.getValue()>
<#else>
<#assign x="none">
</#if>
${x}

=======================
===  County List   ====
=======================
<#list countries as country>
	${country_index + 1}. ${country}
	<#if country == 'India'>
      country is 1
    </#if>
</#list>